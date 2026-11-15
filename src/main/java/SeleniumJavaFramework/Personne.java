package SeleniumJavaFramework;

public class Personne {
    private String nom;
    private int age;

    Personne(String n, int a) {
        nom = n;
        age = a;
    }

    String getNom() {
        return nom;
    }

    int getAge() {
        return age;
    }

    void setAge(int a) {
        if (a >= 0) {
            age = a;
        }
    }

    void sePresenter() {
        System.out.println("Je m'appelle " + nom + ", j'ai " + age + " ans");
    }
}