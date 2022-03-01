
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen: ");
        
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen: ");
        int viimeinen = Integer.valueOf(lukija.nextLine());

        int tulos = 0;

        for (int i = ensimmainen; i <= viimeinen; i++) {

            tulos += i;

        }
        System.out.println("Summa on " + tulos);
    }
}
