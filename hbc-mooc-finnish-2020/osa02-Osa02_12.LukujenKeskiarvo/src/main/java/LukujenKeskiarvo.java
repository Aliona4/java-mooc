
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double keskiarvo = 0;
        int lukuja = 0;
        int lukujenSumma = 0;
        while(true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            lukuja = lukuja + 1; 
            lukujenSumma = lukujenSumma + luku;
            keskiarvo =  (double) lukujenSumma / lukuja; 
            
        }
        System.out.println("Lukujen keskiarvo " + keskiarvo);
    }
}
