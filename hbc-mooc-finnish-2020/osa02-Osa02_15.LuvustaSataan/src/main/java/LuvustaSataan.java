
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int tulostettava = 0;
       
        while (tulostettava <= 100) {
            
            System.out.println(tulostettava);
            tulostettava++;
        }
    }
}
