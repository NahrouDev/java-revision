package SeleniumJavaFramework;

public class Main {

    static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        // estPair
        System.out.println(estPair(4));
        System.out.println(estPair(7));

        // Exercice 3 : une seule note
        int note = 18;

        if (note >= 16) {
            System.out.println(note + " : Excellent");
        } else if (note >= 12 && note <= 15) {
            System.out.println(note + " : Bien");
        } else if (note >= 10 && note <= 11) {
            System.out.println(note + " : Moyen");
        } else {
            System.out.println(note + " : Insuffisant");
        }

        // Exercice 4 : while (à compléter)
        int k = 10;
        while (k >= 2) {
            System.out.println(k);
            k -= 2;
        }

        // Exercice 5 : tableau
        int[] notes = {12, 15, 9, 18, 7};

// 1. Afficher chaque note
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

// 2. Calculer la somme
        int somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        System.out.println("Somme : " + somme);
    }
}