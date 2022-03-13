import java.util.Scanner;

public class App {
        /** @author Aykut Cihan Sevim - 2022 */
    static void FindingPrimeNumber(int a, int i) 
    {
        if(a == i) 
        {
            System.out.println(a + " sayısı ASALDIR !");
            return;
        }
        else if(a % i == 0) 
        {
            System.out.println(a + " sayısı ASAL değildir !");
            return;
        }

        i++;
        FindingPrimeNumber(a,i);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Sayı Giriniz :");
        a = input.nextInt();
       
        FindingPrimeNumber(a,2);

        input.close();
    }
}



