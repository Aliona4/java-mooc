
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int loppu = Integer.valueOf(lukija.nextLine());
        
        int tulos = 0;
         
        for (int i =0; i <= loppu; i++) {
            tulos += i;
           
            
        }
        System.out.println("Summa on " + tulos);
    }
}
