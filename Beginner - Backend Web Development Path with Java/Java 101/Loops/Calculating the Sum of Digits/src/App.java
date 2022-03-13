import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) throws Exception {
        int a,b,c, numberTotal = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();
        c = a;

        while(a < 10)
        {
            System.out.println("En az iki basamaklı pozitif tam sayı giriniz.");
            System.out.print("Sayı Giriniz : ");
            a = input.nextInt();
            c = a;
        }

        while (a != 0) 
        {
            b = a % 10;
            a /= 10;
            numberTotal += b;
        }
        
        System.out.print(c + " Sayısının Basamakları Toplamı : " + numberTotal);
        input.close();
    }
}
