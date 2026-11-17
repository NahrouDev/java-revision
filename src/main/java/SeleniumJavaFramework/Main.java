package SeleniumJavaFramework;

import java.util.ArrayList;

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

    static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        // estPair
        System.out.println(estPair(4));
        System.out.println(estPair(7));

        // while
        int k = 10;
        while (k >= 2) {
            System.out.println(k);
            k -= 2;
        }

        // tableau : somme, max, min
        int[] notes = {12, 15, 9, 18, 7};

        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        System.out.println("Somme : " + total);

        int max = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        System.out.println("Max : " + max);

        int min = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        System.out.println("Min : " + min);

        // méthodes
        System.out.println(maximum(8, 5));
        System.out.println(maximum(3, 10));
        int[] a = {4, 8, 1};
        System.out.println(somme(a));
        System.out.println(somme(notes));

        // String
        String mot = "Bonjour";
        System.out.println(mot.length());
        System.out.println(mot.charAt(6));
        System.out.println(mot.substring(0, 3));

        String attendu = "Connexion reussie";
        String obtenu = "connexion reussie";
        System.out.println(attendu.equals(obtenu));
        System.out.println(attendu.equalsIgnoreCase(obtenu));

        // méthodes void
        afficherMention(18);
        afficherMention(13);
        afficherMention(5);
        afficherTableau(notes);

        // objets Personne
        Personne p1 = new Personne("Karim", 25);
        Personne p2 = new Personne("Sara", 30);
        p1.sePresenter();
        p2.sePresenter();

        // la personne la plus âgée
        Personne[] gens = {
                new Personne("Karim", 25),
                new Personne("Sara", 30),
                new Personne("Omar", 19)
        };

        Personne plusAgee = gens[0];
        for (int i = 1; i < gens.length; i++) {
            if (gens[i].getAge() > plusAgee.getAge()) {
                plusAgee = gens[i];
            }
        }
        System.out.println(plusAgee.getNom());

        // Exercice 12 : ArrayList
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(15);
        liste.add(9);
        liste.add(18);

        int s = 0;
        for (int i = 0; i < liste.size(); i++) {
            s += liste.get(i);
        }
        System.out.println("Somme liste : " + s);

        // Exercice 13 : exception (à compléter)
        try {
            int resultat = 10 / 0;
            System.out.println(resultat);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro impossible");
        } finally {
            System.out.println("Toujours exécuté");
        }
    }
}