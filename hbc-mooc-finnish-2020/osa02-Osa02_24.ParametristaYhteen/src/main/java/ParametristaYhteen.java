
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    }
    public static void tulostaLuvustaYhteen(int luku) {
        int tulostettava = luku;
        while (tulostettava >= 1) {
            System.out.println(tulostettava);
            tulostettava = tulostettava - 1;
        }
    }
}
