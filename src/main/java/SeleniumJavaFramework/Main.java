package SeleniumJavaFramework;

public class Main {

    static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(estPair(10));
        System.out.println(estPair(15));
    }
}