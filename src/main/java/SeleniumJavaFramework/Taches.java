package SeleniumJavaFramework;

import java.io.FileWriter;
import java.io.IOException;

public class Taches {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("taches.txt");
            fw.write("Apprendre Java\n");
            fw.write("Faire un commit\n");
            fw.close();
            System.out.println("Fichier ecrit");
        } catch (IOException e) {
            System.out.println("Erreur d'ecriture : " + e.getMessage());
        }
    }
}