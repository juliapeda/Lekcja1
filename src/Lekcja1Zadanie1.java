public class Lekcja1Zadanie1 {
    public static void main(String[] args) {
        int wiek;
        wiek = 10;

        if (wiek <= 0) return;
        if (wiek >= 120) return;

        if (wiek <= 12) {
            System.out.println("Człowiek jest dzieckiem");
        }
        else if (wiek <= 40) {
            System.out.println("Człowiek jest młody");
        }
        else if (wiek <= 60) {
            System.out.println("Człowiek jest w średnim wieku");
        }
        else if (wiek > 60) {
            System.out.println("Człowiek jest stary");
        }
    }
}

