
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut:");
        int luku = 0;
        int summa = 0;
        int luvutLkm = 0;
        double keskiarvo = 0.0;
        int parilliset = 0; 
        int parittomat = 0; 
        
        while (luku != -1) {
            luku = Integer.valueOf(lukija.nextLine());
            if (luku != -1) {
            
                if(luku % 2 == 0) {
                    parilliset++;
                } else { 
                    parittomat++; 
                }
                summa += luku;
                luvutLkm++;
                keskiarvo = (double) summa / (double) luvutLkm;
            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + luvutLkm);
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parilliset);
        System.out.println("Parittomia: " + parittomat);
              
        
    }
}

