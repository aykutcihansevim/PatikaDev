import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        int r , a;
        double alan, cevre, dilim;


        System.out.println("Dairenin yarı çap bilgisini giriniz: ");
        r = input.nextInt();

        System.out.println("Merkez açı bilgisini giriniz: ");
        a = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilim = (pi *(r*r)* a) / 360;

        System.out.println("Dairenin Çevresi: " + cevre + "\n" + "Dairenin Alanı: " + alan + "\n" + "Daire Diliminin Alanı: " + dilim);

        input.close();

    }
}
