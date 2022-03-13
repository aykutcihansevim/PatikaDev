import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */

    static void RecursiveMethodsbyPattern(int a) 
    {
        if (a <= 0) 
        {
            System.out.print(a + " ");
            return;
        } 
            
        System.out.print(a + " ");
        RecursiveMethodsbyPattern(a - 5);
        System.out.print(a + " ");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();

        System.out.print("Çıktısı      : ");

        RecursiveMethodsbyPattern(a);
        
        input.close();
    }
}