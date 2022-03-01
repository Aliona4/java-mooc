
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
         
        String sana = lukija.nextLine();
     
        int pituus = Integer.valueOf(lukija.nextLine());
        int sananPituus = sana.length();
        int aloitusindeksi = sananPituus - pituus;
        
        
        System.out.println(sana.substring(aloitusindeksi));


    }
}
