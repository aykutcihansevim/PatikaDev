import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    static void ExponentialCalculation(int a, int b) 
    {
        int result = 1;
        for(int n = 0; n<b; n++) 
        {
            result *= a;
        }

        System.out.println("Sonuç : " + result);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Taban değeri giriniz : ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = input.nextInt();
        
        ExponentialCalculation(a,b);

        input.close();
    }


}


