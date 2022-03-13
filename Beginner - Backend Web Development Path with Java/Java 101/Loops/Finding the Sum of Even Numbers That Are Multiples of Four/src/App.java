import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        int c;
        int divisibleTotal = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Beş adet çift bir adet tek sayı giriniz.");

        do{
            System.out.print("Sayı giriniz : ");
            c = input.nextInt();
            if(c % 4 == 0)
            {
                divisibleTotal += c;
            }
        }while(c % 2 == 0);
        

        System.out.print("Girilen sayılar içerisinde 4'ün katları olan sayıların toplamı : " + divisibleTotal);

        input.close();

    }
}
