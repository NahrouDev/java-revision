package SeleniumJavaFramework;

public class Tache {
    private String titre;
    private boolean fait;

    Tache(String titre) {
        this.titre = titre;
        this.fait = false;
    }

    String getTitre() {
        return titre;
    }

    boolean isFait() {
        return fait;
    }

    void marquerFaite() {
        fait = true;
    }

    void afficher() {
        if (fait) {
            System.out.println("[x] " + titre);
        } else {
            System.out.println("[ ] " + titre);
        }
    }
}