import java.util.Scanner;

public class Lekcja1Zadanie2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Wpisz swój wiek");

        Integer wiek = myObj.nextInt();

        if (wiek <= 0) return;
        if (wiek >= 120) return;

        if (wiek <= 12) {
            System.out.println("Człowiek jest dzieckiem");
        } else if (wiek <= 40) {
            System.out.println("Człowiek jest młody");
        } else if (wiek <= 60) {
            System.out.println("Człowiek jest w średnim wieku");
        } else {
            System.out.println("Człowiek jest stary");
        }
    }
}


