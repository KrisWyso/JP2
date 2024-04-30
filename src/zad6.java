public class zad6 {
    public static void main(String[] args) {
        int szerokosc1 = 3;
        int dlugosc1 = 4;
        int szerokosc2 = 3;
        int dlugosc2 = 4;
        int szerokosc3 = 2;
        int dlugosc3 = 3;
        int szerokosc4 = 2;
        int dlugosc4 = 2;

        int pomieszczenie1 = szerokosc1 * dlugosc1;
        int pomieszczenie2 = szerokosc2 * dlugosc2;
        int pomieszczenie3 =szerokosc3 * dlugosc3;
        int pomieszczenie4 = szerokosc4 * dlugosc4;

        int wymiarmieszkania = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 +pomieszczenie4;
        System.out.println(pomieszczenie1 + "-pom1");
        System.out.println(pomieszczenie2 + "- pom2");
        System.out.println(pomieszczenie3 + "-pom3");
        System.out.println(pomieszczenie4 + "-pom4");
        System.out.println(wymiarmieszkania + "-całe mieszkanie");
        int osoby = 4;
        double wymnaosb  = wymiarmieszkania/osoby;
        System.out.println(wymnaosb + "-metry na osobe");
    }
}
