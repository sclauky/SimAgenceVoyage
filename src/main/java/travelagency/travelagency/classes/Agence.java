package travelagency.travelagency.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Agence {
    private List<Client> clients;//permet à l'agence d'avoir une liste de client
    private List<Voyage> voyages;
    private Scanner sc;

    public Agence() {
        this.clients = new ArrayList<Client>();
    }

    // permet à l'utilisateur de créer le client
    public void CreateClient(String name, String nbr) {
        int newNbr = Integer.parseInt(nbr);
        Client client = new Client(name, newNbr);
        this.clients.add(client);
    }

    public void ChooseVoyage(String Destination, Vol Vol, Logement Logement) {
        System.out.println("Où voulez-vous partir ?");
        String ChooseDestination = sc.nextLine();
        this.voyages.add((Voyage) voyages);
    }

    public class main {
        public class Main {
            public static void main(String[] args) {
                // 2. IMPORTANT : La déclaration de la variable "sc"
                Scanner sc = new Scanner(System.in);
            }
        }

        public static void main(String[] args) {
            // On peut changer la ligne ci-dessous par "new Paypal()" sans rien changer d'autre !
            MoyenDePaiement monPaiement = new CarteBancaire();

            // On appelle la méthode sans se soucier du détail technique
            monPaiement.payer(49.90);
        }
    }
}
