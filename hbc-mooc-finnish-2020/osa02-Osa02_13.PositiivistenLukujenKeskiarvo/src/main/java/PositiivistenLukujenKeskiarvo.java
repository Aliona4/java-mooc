
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double keskiarvo = 0;
        int lukuja = 0;
        int lukujenSumma = 0;
        while (true) {

            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku > 0) {

                lukuja = lukuja + 1;
                lukujenSumma = lukujenSumma + luku;
                keskiarvo = (double) lukujenSumma / lukuja;
            }
        }
        if (lukuja > 0) {
            System.out.println(keskiarvo);
        } else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista ");

        }

    }
}
