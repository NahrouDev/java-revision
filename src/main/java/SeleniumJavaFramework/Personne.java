package SeleniumJavaFramework;

public class Personne {
    String nom;
    int age;

    Personne(String n, int a) {
        nom = n;
        age = a;
    }

    void sePresenter() {
        System.out.println("Je m'appelle " + nom + ", j'ai " + age + " ans");
    }
}