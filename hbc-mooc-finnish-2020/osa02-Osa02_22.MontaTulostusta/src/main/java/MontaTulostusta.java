
import java.util.Scanner;

public class MontaTulostusta {

    
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
         // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
    
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka monta? ");
        int maara = Integer.valueOf(lukija.nextLine());
        int kerrat = 0;
        
        while(maara > kerrat){
            tulostaTeksti();
            kerrat++;
        }
    }
    public static void tulostaTeksti() {
        // kirjoita koodia tähän
        System.out.println("Alussa olivat suo, kuokka ja Java. ");
        
    }

}    
    // HUOM: älä muuta metodin määrittelevää eli seuraavaa riviä!
    // (tässä tehtävässä ei ole vielä tarkoitus laittaa metodille parametria)
    
         
    
   
