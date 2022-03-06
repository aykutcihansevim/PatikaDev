import java.util.Scanner;

public class App {
         /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.print("Üçgenin Hipotenüsü: " + c + "\n" + "\n");

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextDouble();

        double u, cevre, alan;
        u = (a + b + c)/ 2;
        cevre = 2 * u;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin Çevresi: " + cevre + "\n" + "Üçgenin Alanı: " + alan);

        input.close();
    }
}
