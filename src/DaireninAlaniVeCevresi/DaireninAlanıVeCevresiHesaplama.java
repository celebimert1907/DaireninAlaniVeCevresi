package DaireninAlaniVeCevresi;

import java.util.Scanner;

public class DaireninAlanıVeCevresiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float r;
        double pi = 3.14;

        System.out.print("Dairenin yari capini giriniz: ");
        r = input.nextFloat();

        double daireAlan;
        daireAlan = pi * r * r ;
        System.out.println("Dairenin alani: " + daireAlan );

        double daireCevre;
        daireCevre = 2 * pi * r ;
        System.out.println("Dairenin cevresi: " + daireCevre);


    }
}
