import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.Sayı :");
        a = input.nextInt();
        System.out.print("2.Sayı :");
        b = input.nextInt();
        System.out.print("3.Sayı :");
        c = input.nextInt();

        if((a < b) && (a < c))
        {
            if(b<c)
            {
                System.out.println("Küçükten Büyüğe Sıralı Sayılar : " + a + " < " + b + " < " + c);
            }
            else
            {
                System.out.println("Küçükten Büyüğe Sıralı Sayılar : " + a + " < " + c + " < " + b);
            }
        }
        else if((b < a) && (b < c))
        {
            if(a < c)
            {
                System.out.println("Küçükten Büyüğe Sıralı Sayılar : " + b + " < " + a + " < " + c);
            }
            else
            {
                System.out.println("Küçükten Büyüğe Sıralı Sayılar : " + b + " < " + c + " < " + a);
            }
        }
        else 
        {
            if(a<b)
            {
                System.out.println("Küçükten Büyüğe Sıralı Sayılar : " + c + " < " + a + " < " + b);
            }
            else
            {
                System.out.println("Küçükten Büyüğe Sıralı Sayılar : " + c + " < " + b + " < " + a);
            }
        }

        input.close();
    }
}
