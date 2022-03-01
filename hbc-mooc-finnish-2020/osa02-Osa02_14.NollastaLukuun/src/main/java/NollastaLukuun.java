
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int tulostettava = 0;
       
        while (tulostettava <= ylaraja) {
            
            System.out.println(tulostettava);
            tulostettava++;
        }
    }  
}   

