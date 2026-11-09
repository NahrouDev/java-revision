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
    }
}