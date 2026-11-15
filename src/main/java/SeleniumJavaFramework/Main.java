package SeleniumJavaFramework;

public class Main {

    static boolean estPair(int n) {
        return n % 2 == 0;
    }

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int somme(int[] tab) {
        int total = 0;
        for (int i = 0; i < tab.length; i++) {
            total += tab[i];
        }
        return total;
    }

    // Nouveau : méthode void, elle affiche et ne rend rien
    static void afficherMention(int note) {
        if (note >= 16) {
            System.out.println(note + " : Excellent");
        } else if (note >= 12 && note <= 15) {
            System.out.println(note + " : Bien");
        } else if (note >= 10 && note <= 11) {
            System.out.println(note + " : Moyen");
        } else {
            System.out.println(note + " : Insuffisant");
        }
    }

    // Exercice 10 : à compléter
    static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        // estPair
        System.out.println(estPair(4));
        System.out.println(estPair(7));

        // Exercice 4 : while
        int k = 10;
        while (k >= 2) {
            System.out.println(k);
            k -= 2;
        }

        // Exercice 5 : tableau
        int[] notes = {12, 15, 9, 18, 7};

        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        System.out.println("Somme : " + total);

        // Le plus grand
        int max = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        System.out.println("Max : " + max);

        // Le plus petit
        int min = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        System.out.println("Min : " + min);

        // Exercice 6 et 7 : méthodes
        System.out.println(maximum(8, 5));
        System.out.println(maximum(3, 10));
        int[] a = {4, 8, 1};
        System.out.println(somme(a));
        System.out.println(somme(notes));

        // Exercice 8 : String
        String mot = "Bonjour";
        System.out.println(mot.length());
        System.out.println(mot.charAt(6));
        System.out.println(mot.substring(0, 3));

        // Exercice 9 : comparer des String
        String attendu = "Connexion reussie";
        String obtenu = "connexion reussie";
        System.out.println(attendu.equals(obtenu));
        System.out.println(attendu.equalsIgnoreCase(obtenu));

        // Nouveau : méthodes void
        afficherMention(18);
        afficherMention(13);
        afficherMention(5);

        // Exercice 10
        afficherTableau(notes);

        Personne p1 = new Personne("Karim",25);
        p1.sePresenter();

        Personne p2 = new Personne("Sara",30);
        p2.sePresenter();
    }
}