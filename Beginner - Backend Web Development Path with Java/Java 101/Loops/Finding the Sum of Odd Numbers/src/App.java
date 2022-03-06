import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        
        int c;
        int divisibleTotal = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            c = input.nextInt();
            if(c % 2 == 0 && c % 4 == 0)
            {
                divisibleTotal += c;
            }
        }while(c % 2 == 0);
        

        System.out.print("Girilen sayılar içerisinde ikinin ve dördün katları olan sayıların toplamı : " + divisibleTotal);

        input.close();

    }
}
