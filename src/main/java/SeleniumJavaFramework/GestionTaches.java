package SeleniumJavaFramework;

import java.util.ArrayList;

public class GestionTaches {
    public static void main(String[] args) {
        ArrayList<Tache> taches = new ArrayList<>();

        taches.add(new Tache("Apprendre Java"));
        taches.add(new Tache("Faire un commit"));
        taches.add(new Tache("Creer le mini-projet"));

        taches.get(1).marquerFaite();

        for (int i = 0; i < taches.size(); i++) {
            taches.get(i).afficher();
        }
    }
}