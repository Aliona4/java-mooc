
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Lahjan suuruus? ");
        int luku = Integer.valueOf(lukija.nextLine());
        //if (vuosi % 4 == 0 && (vuosi % 100 != 0 || vuosi % 400 == 0)) {
        if (luku >= 5000 && luku <= 25000){ 
            double vero = (double) (0.08 * (luku - 5000) + 100);
            System.out.println(vero);
        
        } else if (luku >= 25001 && luku <= 55000){
            double vero = (double) (0.1 * (luku - 25000) + 1700); 
            System.out.println(vero);
        } else if (luku >= 55001 && luku <= 200000){ 
            double vero = (double) (0.12 * (luku - 55000) + 4700);
            System.out.println(vero);
        } else if (luku >= 200001 && luku <= 1000000){ 
            double vero = (double) (0.15 * (luku - 200000) + 22100);        
            System.out.println(vero);
        } else if (luku >= 1000001){ 
            double vero = (double) (0.17 * (luku - 1000000) + 142100);
            System.out.println(vero);
             
        } else {
            System.out.println("Ei veroa!");
        }
    } 
}
