
import java.util.Scanner;

public class KahdenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf(lukija.nextLine());
        int laskuSuluilla = (eka + toka);
        System.out.println("Lukujen summa on " + (laskuSuluilla));
       
    }
}
