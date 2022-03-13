import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int a = 1, b = 1, ebob = 1, ekok = 1;
        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextInt();

        int smallNumber = (a < b) ? a : b;

        while (smallNumber > 1) {
            if (a % smallNumber == 0 && b % smallNumber == 0) 
            {
                ebob = smallNumber;
                ekok = (a * b) / ebob;
                break;
            }
            smallNumber--;
        }

        System.out.println(a + " ve " + b + " sayıları için EBOB: " + ebob + " EKOK: " + ekok );
        input.close();
    }
}
