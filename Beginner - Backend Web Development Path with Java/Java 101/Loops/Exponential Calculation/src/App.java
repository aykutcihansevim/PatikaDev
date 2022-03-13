import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    public static void main(String[] args) {
        int s,u;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        s = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        u = input.nextInt();

        int result = 1;

        for(int i = 1; i<=u; i++)
        {
            result = result * s;
        }
        
        System.out.println("Sonuç : " + result);

        input.close();
    }
}
